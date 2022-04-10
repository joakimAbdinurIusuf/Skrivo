import React from 'react';
import './Sidebar.css';
import {SidebarData} from './SidebarData';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import { SidebarBotData } from './SideBarBotData';
import ModeNightIcon from '@mui/icons-material/ModeNight';


function Sidebar() {
    return (
        <div className="Sidebar">
            <div className="SideBarTop"> {/*top section of sidebar. above first line*/}
                <AccountCircleIcon className="profile"/>
                <hr className='SideBarTopLine'/>
            </div>
            <ul className='SideBarList'> {/*middle section of sidebar, between lines*/}
                {SidebarData.map((key) => {
                    return (
                        <li className="row">
                            <div>
                                {key.icon} {key.title} {key.line}
                            </div>
                        </li>
                    )
                })}
            </ul>
            <div className='SideBarBot'>
                    <hr className='SideBarBotLine'/>
                    <p className='settingsParagraph'>Settings</p>
                </div>
            <ul className="SideBarList"> {/*bottom section of sidebar, below second line*/}
                {SidebarBotData.map((key) => {
                    return (
                        <li className="row">
                            <div>
                                {key.icon} {key.title}
                            </div>
                        </li>
                    )
                })}
            </ul>
            <div className="sidebar-bottom">
                <ModeNightIcon className="nightMode"/>
                <p className="help">Help</p>
            </div>
        </div>
    )
}

export default Sidebar